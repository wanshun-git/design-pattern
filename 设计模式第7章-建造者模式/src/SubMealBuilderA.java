
/**
 * A套餐建造者类
 * @author ★天命之子★
 *
 */
public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡腿堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯可乐");
	}

}
