package model;

public class CancelState extends OrderState {
	
	//constructor temporalmente con modificador publico, evaluar si el alcance es de paquete
	public CancelState() {
		name = "cancelado";
	}
	
	@Override
	public void getPrepare(Order anOrder) {
		throw new RuntimeException(CANT_BE_PREPARED);
	}

	@Override
	public void getArrive(Order anOrder) {
		throw new RuntimeException(CANT_BE_ARRIVED);
	}

	@Override
	public void getCancel(Order anOrder) {
		throw new RuntimeException(CANT_BE_CANCEL);
	}
}
