package model.order;

public class PendingState extends OrderStateFactory {
	
	//constructor temporalmente con modificador publico, evaluar si el alcance es de paquete
	 protected PendingState() {
		super("Pendiente");
	}
	
	@Override
	public void getPrepare(Order anOrder) {
		anOrder.updateLastModify();
		anOrder.setState(super.getPreparedState());
	}

	@Override
	public void getArrive(Order anOrder) {
		throw new RuntimeException(CANT_BE_ARRIVED);
	}

	@Override
	public void getCancel(Order anOrder) {
		anOrder.updateLastModify();
		anOrder.setState(super.getCancelState());
	}

}
