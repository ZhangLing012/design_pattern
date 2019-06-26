package com.geely.design.pattern.structural.adapter.mvc;

public class Test {
    public static void main(String[] args) {
        Controller controllerImpl1 = new ControllerImpl1();
        HandlerAdapter adapter = getAdapter(controllerImpl1);
        adapter.handle(controllerImpl1);
    }

    static HandlerAdapter getAdapter(Controller controller) {
        if (controller instanceof ControllerImpl1) {
            return new HandlerAdapterImpl1();
        } else {
            return new HandlerAdapterImpl2();
        }
    }
}
