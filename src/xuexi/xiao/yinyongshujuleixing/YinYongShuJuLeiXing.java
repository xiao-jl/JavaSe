package xuexi.xiao.yinyongshujuleixing;

//引用数据类型

public class YinYongShuJuLeiXing {
    public static void main(String[] args) {

        //创建数组
        CeShiLei[] CeShiLei = new CeShiLei[3];

        //创建对象
        CeShiLei s1 = new CeShiLei("小明",30);
        CeShiLei s2 = new CeShiLei("小红",40);
        CeShiLei s3 = new CeShiLei("小绿",35);

        //把对象赋值给数组
        CeShiLei[0] = s1;
        CeShiLei[1] = s2;
        CeShiLei[2] = s3;

        //遍历数组
        for (int i = 0; i < CeShiLei.length; i++) {
            CeShiLei s = CeShiLei[i];
            System.out.println(s.getA() + "---" + s.getB());
        }

    }
}
