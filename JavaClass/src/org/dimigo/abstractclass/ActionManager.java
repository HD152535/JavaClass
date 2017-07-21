package org.dimigo.abstractclass;

public class ActionManager {

	public static final String PKG_NAME = "org.dimigo.abstractclass.";
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		
		if (args == null || args.length == 0)
			return;
		System.out.println(args[0]);

		Action action = getAction2(args[0]);
		action.execute();
		
	}

	// 객체를 정적으로 생성 ( new InsertAction())
	private static Action getAction(String actionName) {
		Action action = null;
		if ("insert".equalsIgnoreCase(actionName)) {
			action = new InsertAction();
		} else if ("delete".equalsIgnoreCase(actionName)) {
			action = new DeleteAction();
		} else if ("update".equalsIgnoreCase(actionName)) {
			action = new UpdateAction();
		}
		return action;
	}
	
	
	// 객체를 동적으로 생성 (Reflection API)
	private static Action getAction2(String actionName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls = Class.forName(PKG_NAME + actionName + "Action");
		Action action = (Action)cls.newInstance();
		
		return action;
		
		
	}

}
