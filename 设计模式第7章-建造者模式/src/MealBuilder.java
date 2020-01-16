
/**
 * 套餐建造者类
 * @author ★天命之子★
 *
 */
public abstract class MealBuilder {

	protected Meal meal = new Meal();
	
	public abstract void buildFood();
	public abstract void buildDrink();
	
	public Meal getMeal() {
		return meal;
	}
}
