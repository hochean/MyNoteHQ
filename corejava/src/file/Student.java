package file;

import lombok.Builder;

/**
 * @author HaoQ
 */
@Builder
class Student {
    private int age;
    private String name;
    private String[] arr;

    @Override
    public String toString() {
        /*return MoreObjects.toStringHelper(this)
                .add("age", age)
                .add("name", name)
                .add("arr", arr)
                .toString();*/
        StringBuilder arrStr = new StringBuilder();
        for (String s : arr) {
            arrStr.append(s);
        }
        return "age: " + age +
               "\nname: " + name +
               "\narr: " +arrStr;
    }
}
