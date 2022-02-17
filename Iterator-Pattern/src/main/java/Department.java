import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部门
 *
 * @author 黄昌其
 * @date 2022/02/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
     /**
      * 名字
      */
     private String name;
     /**
      * 说明
      */
     private String desc;
}
