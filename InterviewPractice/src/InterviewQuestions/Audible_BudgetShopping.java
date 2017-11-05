package InterviewQuestions;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Joel on 03-11-2017.
 */
public class Audible_BudgetShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("no. of Items");
        int size = scanner.nextInt();
        int arr_quant[] = new int[size];
        int arr_cost[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr_quant[i] = scanner.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            arr_cost[i] = scanner.nextInt();
        }

        System.out.println("Max no of items");
        int count = scanner.nextInt();
        System.out.println(shoppingItems(count,arr_quant,arr_cost));

    }
    public static int shoppingItems(int n,int arr_quant[],int arr_cost[])
    {
        int result = 0;
        PriorityQueue<Product> queue = new PriorityQueue<>();

        for (int i = 0; i < arr_quant.length; i++) {
            double value = arr_cost[i] / arr_quant[i];
            Product new_product = new Product(arr_cost[i], arr_quant[i], value);
            queue.add(new_product);
        }

        while (n > 0 && !queue.isEmpty()) {
            Product product = queue.peek();
            if (product.prod_cost <= n) {
                n -= product.prod_cost;
                result+= product.prod_quant;
            } else {
                queue.remove();
            }
        }
        return result;
    }
    static class Product implements Comparable<Product>
    {
        int prod_cost, prod_quant;
        double value;

        public Product(int cost, int quantity, double value) {
            this.prod_cost = cost;
            this.prod_quant = quantity;
            this.value = value;
        }

        @Override
        public int compareTo(Product product) {
            return Double.compare(this.value,product.value);
        }
    }
}
