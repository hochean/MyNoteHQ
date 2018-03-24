package builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author HaoQ
 */
@Builder
@Data
class Person {
    private String age;
    private String name;
}
