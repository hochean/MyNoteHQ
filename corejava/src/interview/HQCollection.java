package interview;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * fusionskye面试题-初级
 * 交集 并集 差集
 *
 * @author HaoQ
 */
public class HQCollection {
    private List<Integer> setA = Lists.newArrayList(1, 3, 5, 7);
    private List<Integer> setB = Lists.newArrayList(1, 2, 5);

    //交集
    private List<Integer> firstGetIntersectionByMyself() {

        final List<Integer> intersection = Lists.newArrayList();
        for (Integer integerA : setA) {
            if (setB.contains(integerA)) {
                intersection.add(integerA);
            }
        }
        for (Integer integerB : setB) {
            if (setA.contains(integerB) && !intersection.contains(integerB)) {
                intersection.add(integerB);
            }
        }
        return intersection;
    }

    //并集
    private List<Integer> firstGetUnionByMyself() {

        final List<Integer> union = setA;
        for (Integer integer : setB) {

            if (!union.contains(integer)) {
                union.add(integer);
            }
        }
        Collections.sort(union);
        return union;
    }

    //差集
    private List<Integer> firstGetDSByMyself() {

        final List<Integer> DS = Lists.newArrayList();
        for (Integer integerA : setA) {

            if (!setB.contains(integerA)) {
                DS.add(integerA);
            }
        }
        return DS;
    }

    public static void main(String[] args) {

        final HQCollection hqCollection = new HQCollection();
        final List<Integer> intersection = hqCollection.firstGetIntersectionByMyself();
        final List<Integer> union = hqCollection.firstGetUnionByMyself();
        final List<Integer> differenceSet = hqCollection.firstGetDSByMyself();
        System.out.println("交集: " + intersection);
        System.out.println("并集: " + union);
        System.out.println("差集: " + differenceSet);
    }
}
