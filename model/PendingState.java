package model;

public class PendingState extends OrderState {
	
	//constructor temporalmente con modificador publico, evaluar si el alcance es de paquete
	public PendingState() {
		name = "pendiente";
	}
	
	@Override
	public void getPrepare(Order anOrder) {
		anOrder.setOrderState(anOrder.getPreparedState());
	}

	@Override
	public void getArrive(Order anOrder) {
		throw new RuntimeException(CANT_BE_ARRIVED);
	}

	@Override
	public void getCancel(Order anOrder) {
		anOrder.setOrderState(anOrder.getCancelState());
	}

}