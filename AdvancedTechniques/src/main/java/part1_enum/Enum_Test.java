package part1_enum;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: part1
 * @Author: JuferBlue
 * @CreateTime: 2024-07-02  18:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Enum_Test {
    public static void main(String[] args) {
        Enum_Direction dir = Enum_Direction.EAST;
        System.out.println(dir.getName());

        //valueOf()获取枚举常量
        for(Enum_Direction d : Enum_Direction.values()){
            //获取名称
            System.out.println(d.getName());
        }
    }
}
