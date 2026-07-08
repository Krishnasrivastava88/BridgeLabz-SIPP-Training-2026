import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args){
        Seller s1=new Seller(1,"Raj","raj@mail.com","TechWorld",4.8);
        Seller s2=new Seller(2,"Amit","amit@mail.com","MobileHub",4.2);
        Seller s3=new Seller(3,"Neha","neha@mail.com","FashionStore",4.9);

        List<Seller> sellers=Arrays.asList(s1,s2,s3);

        List<Customer> customers=Arrays.asList(
            new Customer(1,"Krishna","k1@mail.com","Delhi",true),
            new Customer(2,"Ankit","k2@mail.com","Chennai",false),
            new Customer(3,"Riya","k3@mail.com","Mumbai",true),
            new Customer(4,"Rahul","k4@mail.com","Lucknow",false)
        );

        List<Product> products=Arrays.asList(
            new Product(1,"Laptop","Electronics",60000,4.7,true,s1),
            new Product(2,"Mouse","Electronics",800,4.2,true,s1),
            new Product(3,"Phone","Electronics",25000,4.8,false,s2),
            new Product(4,"Shoes","Fashion",3000,4.5,true,s3),
            new Product(5,"Watch","Fashion",5000,4.9,true,s3),
            new Product(6,"Keyboard","Electronics",1500,4.1,true,s1),
            new Product(7,"Bag","Fashion",1200,4.3,false,s3),
            new Product(8,"Tablet","Electronics",18000,4.6,true,s2)
        );

        System.out.println("1. Product Names");
        products.stream().map(Product::getProductName).forEach(System.out::println);

        System.out.println("\n2. In Stock");
        products.stream().filter(Product::isInStock).forEach(System.out::println);

        System.out.println("\n3. Price >1000");
        products.stream().filter(p->p.getPrice()>1000).forEach(System.out::println);

        System.out.println("\n4. Prime Customers");
        customers.stream().filter(Customer::isPrimeMember).forEach(System.out::println);

        System.out.println("\n5. Sellers Rating >4.5");
        sellers.stream().filter(x->x.getSellerRating()>4.5).forEach(System.out::println);

        System.out.println("\n6. Sort by Price");
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        System.out.println("\n7. Sellers Desc Rating");
        sellers.stream().sorted(Comparator.comparing(Seller::getSellerRating).reversed()).forEach(System.out::println);

        System.out.println("\n8. Categories");
        products.stream().map(Product::getCategory).distinct().forEach(System.out::println);

        System.out.println("\n9. In Stock Count="+products.stream().filter(Product::isInStock).count());

        System.out.println("\n10. Costliest="+products.stream().max(Comparator.comparing(Product::getPrice)).get());
        System.out.println("Cheapest="+products.stream().min(Comparator.comparing(Product::getPrice)).get());

        System.out.println("\n11. Average="+products.stream().collect(Collectors.averagingDouble(Product::getPrice)));

        System.out.println("\n12. Total="+products.stream().map(Product::getPrice).reduce(0.0,Double::sum));

        System.out.println("\n13. All in stock="+products.stream().allMatch(Product::isInStock));

        System.out.println("\n14. Any Delhi="+customers.stream().anyMatch(c->c.getCity().equalsIgnoreCase("Delhi")));

        System.out.println("\n15. First Prime="+customers.stream().filter(Customer::isPrimeMember).findFirst().get());

        System.out.println("\n16. Top3 Rated");
        products.stream().sorted(Comparator.comparing(Product::getRating).reversed()).limit(3).forEach(System.out::println);

        System.out.println("\n17. Group by Category");
        System.out.println(products.stream().collect(Collectors.groupingBy(Product::getCategory)));

        System.out.println("\n18. Group by Seller");
        System.out.println(products.stream().collect(Collectors.groupingBy(p->p.getSeller().getName())));

        System.out.println("\n19. Partition");
        System.out.println(products.stream().collect(Collectors.partitioningBy(Product::isInStock)));

        System.out.println("\n20. Map");
        System.out.println(products.stream().collect(Collectors.toMap(Product::getProductId,p->p)));

        System.out.println("\n21. Customer Names");
        System.out.println(customers.stream().map(Customer::getName).collect(Collectors.joining(",")));
    }
}
