package part1_enum;


//所有的enum定义的枚举类 默认的父类都是Enum类
public enum Enum_Direction {
    NORTH("北"),SOUTH("南"),EAST("东"),WEST("西");
    private String name;
    private Enum_Direction(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
