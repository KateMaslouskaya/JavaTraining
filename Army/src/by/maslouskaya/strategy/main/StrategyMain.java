package by.maslouskaya.strategy.main;

import by.maslouskaya.strategy.army.Army;
import by.maslouskaya.strategy.operation.OrderOperation;
import by.maslouskaya.strategy.order.Order;

public class StrategyMain {

	public static void main(String[] args) {
		Army invArmy = new Army("Invincible Army");
		invArmy.newDetachment("DRAGONS");
		invArmy.newDetachment("SCOUTS");
		invArmy.newDetachment("MAGICIANS");
		//ArmyOperation.printArmyInfo(invArmy);
		//ArmyOperation.printArmyComposition(invArmy);
		Army badGuys = new Army("The Bad Guys");
		badGuys.newDetachment("SWORDSMEN");
		badGuys.newDetachment("ARCHERS");
		badGuys.newDetachment("CAVALRY");
		badGuys.newDetachment("SCOUTS");
		//ArmyOperation.printArmyInfo(badGuys);
		//ArmyOperation.printArmyComposition(badGuys);
		Order order1 = new Order("User", invArmy, 2, true);
		OrderOperation.printOrderInfo(order1);
		OrderOperation.printCheck(order1);
		Order order2 = new Order("God", badGuys, 1, false);
		OrderOperation.printOrderInfo(order2);
		OrderOperation.printCheck(order2);
	}

}
