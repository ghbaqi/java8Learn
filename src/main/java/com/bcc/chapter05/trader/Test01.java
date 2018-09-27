package com.bcc.chapter05.trader;

import com.bcc.chapter05.base.TraderUtil;
import com.bcc.chapter05.base.Transaction;

import java.util.Optional;

/**
 * 1. 找出 2011 年发生的所有交易,按照交易额排序
 * 2. 交易员都在哪些不同的城市工作过
 * 3. 查找所有来自于 Cambridge 的交易员,按照姓名排序
 * 4. 返回所有交易员的姓名,按照字母顺序排序
 * 5. 有没有交易员在 Mario 生活过
 * 6. 打印所有生活在剑桥的交易员的所有交易额
 * 7. 所有的交易中, 最高的交易额
 * 8. 找出交易额最小的交易
 */
public class Test01 {

    public static void main(String[] args) {

        // 1. 找出 2011 年发生的所有交易,按照交易额排序
        //        List<Transaction> transactions = TraderUtil.transactions.stream()
        //                .filter(transaction -> transaction.getYear() == 2011)
        //                .sorted((a, b) -> a.getValue() - b.getValue())
        //                .collect(Collectors.toList());
        //        System.out.println(transactions);


        // 2. 交易员都在哪些不同的城市工作过
        //        List<String> cities = TraderUtil.transactions.stream()
        //                .map(transaction -> transaction.getTrader().getCity())
        //                .distinct()
        //                .collect(Collectors.toList());
        //        System.out.println(cities);

        // 3. 查找所有来自于 Cambridge 的交易员,按照姓名排序
        //        List<Trader> traders = TraderUtil.transactions.stream()
        //                .map(transaction -> transaction.getTrader())
        //                .filter(trader -> trader.getCity().equals("Cambridge"))
        //                .sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        //        System.out.println(traders);

        // 4. 返回所有交易员的姓名,按照字母顺序排序   体会 flatMap 的使用场景
        //        List<String> names = TraderUtil.transactions
        //                .stream()
        //                .flatMap(transaction -> Arrays.asList(transaction.getTrader().getName()).stream())
        //                .sorted((a,b)->a.charAt(0)-b.charAt(0))
        //                .collect(Collectors.toList());
        //        System.out.println(names);


        // 5. 有没有交易员在 Mario 生活过
        //        List<String> mario = TraderUtil.transactions.stream().flatMap(transaction -> {
        //            ArrayList<String> list = new ArrayList<>();
        //            list.add(transaction.getTrader().getCity());
        //            return list.stream();
        //        }).filter(city -> city.equals("Milan")).collect(Collectors.toList());
        //        System.out.println(mario);

        // 6. 打印所有生活在 Cambridge 的交易员的所有交易额
        //        TraderUtil.transactions
        //                .stream()
        //                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
        //                .map(Transaction::getValue)
        //                .forEach(System.out::println);

        // 7. 所有的交易中, 最高的交易额
        //        Optional<Integer> max = TraderUtil.transactions
        //                .stream()
        //                .map(transaction -> transaction.getValue()).reduce((a, b) -> a > b ? a : b);
        //        System.out.println(max.get());

        //        Optional<Integer> max = TraderUtil.transactions
        //                .stream()
        //                .map(transaction -> transaction.getValue()).reduce(Integer::max);
        //        System.out.println(max.get());


        // 8. 找出交易额最小的交易
        Optional<Transaction> reduce = TraderUtil.transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(reduce.get());

    }
}
