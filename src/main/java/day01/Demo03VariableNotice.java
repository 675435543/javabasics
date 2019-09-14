package day01;

/*
使用变量的时候，有一些注意事项：

1. 如果创建多个变量，那么变量之间的名称不可以重复。
2. 在创建变量之前，不能使用这个变量
3. 变量使用不能超过作用域的范围。
【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。
4. 局部变量没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用。
5. 对于 long 和 float 类型来说，字母后缀 L 和 F 不要丢掉。
6. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
7. 可以通过一个语句来创建多个变量，但是一般情况不推荐这么写。
*/
public class Demo03VariableNotice {
	public static void main(String[] args) {
		int num1 = 20;
		int num2;
		num2 = 30;

		int num3 = 10; // 创建了一个新的变量，名叫 num3
		// int num3 = 20; // 又创建了另一个新的变量，名字也叫 num3，错误！

		// System.out.println(num4); // 在创建变量之前，不能使用这个变量
		int num4 = 500;
		System.out.println(num4); // 500

		{
			int num5 = 60;
			System.out.println(num5); // 60
		}
		// System.out.println(num5); // 已经超出了大括号的范围，超出了作用域，变量不能再使用了

		int num6; // 定义了一个变量，但是没有进行赋值
//		System.out.println(num6); // 直接使用打印输出就是错误的！

		float floata = 2.3F;
//		float floatb = 2.3;  //报错
		double doublea = 2.3;

/*
		 1，前提：
		 将byte short int long 前面理解为小类型，后面理解为大类型
		 将float double 前面理解为小类型，后面理解为大类型
		 2. 规则：
		 大类型可以装小类型的数据,不需要强转
		 小类型不可以装大类型的数据，如果要装需要强转。这时会损失精度
		 */
		doublea =  floata;
//		floata =  doublea;//报错
		floata = (float) doublea;
		//几点几 如2.3 默认是双精度类型。而2.3F是单精度类型

		byte bytea = 2;
		short shorta = 2;
		int inta = 2;
//		int intb = 2L; //报错
		long longa = 2;
		long longb = 2L;
/*
		 1,这里认为2是没有默认类型的，并不能认为它默认是int类型
		 因为假设它默认是int类型的话，大类型给小类型时会报错
		 2, 右侧的数据值超过左侧类型的范围时，会有错误提示
		 3， 2L 在2后面加L就明确指定了类型是long类型的
		 */

		// 同时创建了三个全都是int类型的变量
		int a, b, c;
		// 各自分别赋值
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a); // 10
		System.out.println(b); // 20
		System.out.println(c); // 30
		
		// 同时创建三个int变量，并且同时各自赋值
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
}