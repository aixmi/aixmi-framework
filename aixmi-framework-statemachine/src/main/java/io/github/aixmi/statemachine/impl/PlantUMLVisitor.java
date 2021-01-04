package io.github.aixmi.statemachine.impl;


import io.github.aixmi.statemachine.State;
import io.github.aixmi.statemachine.StateMachine;
import io.github.aixmi.statemachine.Transition;
import io.github.aixmi.statemachine.Visitor;

/**
 * PlantUMLVisitor
 *
 * @author Frank Zhang
 * @date 2020-02-09 7:47 PM
 */
public class PlantUMLVisitor implements Visitor {

	/**
	 * Since the state machine is stateless, there is no initial state.
	 * <p>
	 * You have to add "[*] -> initialState" to mark it as a state machine diagram.
	 * otherwise it will be recognized as a sequence diagram.
	 *
	 * @param visitable the element to be visited.
	 * @return
	 */
	@Override
	public String visitOnEntry(StateMachine<?, ?, ?> visitable) {
		return "@startuml" + LF;
	}

	@Override
	public String visitOnExit(StateMachine<?, ?, ?> visitable) {
		return "@enduml";
	}

	@Override
	public String visitOnEntry(State<?, ?, ?> state) {
		StringBuilder sb = new StringBuilder();
		for (Transition transition : state.getTransitions()) {
			sb.append(transition.getSource().getId())
					.append(" --> ")
					.append(transition.getTarget().getId())
					.append(" : ")
					.append(transition.getEvent())
					.append(LF);
		}
		return sb.toString();
	}

	@Override
	public String visitOnExit(State<?, ?, ?> state) {
		return "";
	}
}
