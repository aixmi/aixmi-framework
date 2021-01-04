package io.github.aixmi.statemachine.builder;


import io.github.aixmi.statemachine.Action;
import io.github.aixmi.statemachine.Condition;
import io.github.aixmi.statemachine.State;
import io.github.aixmi.statemachine.Transition;
import io.github.aixmi.statemachine.impl.StateHelper;
import io.github.aixmi.statemachine.impl.TransitionType;

import java.util.Map;

/**
 * TransitionBuilderImpl
 *
 * @author Frank Zhang
 * @date 2020-02-07 10:20 PM
 */
class TransitionBuilderImpl<S, E, C> implements ExternalTransitionBuilder<S, E, C>, InternalTransitionBuilder<S, E, C>, From<S, E, C>, On<S, E, C>, To<S, E, C> {

	final Map<S, State<S, E, C>> stateMap;
	final TransitionType transitionType;
	protected State<S, E, C> target;
	private State<S, E, C> source;
	private Transition<S, E, C> transition;

	public TransitionBuilderImpl(Map<S, State<S, E, C>> stateMap, TransitionType transitionType) {
		this.stateMap = stateMap;
		this.transitionType = transitionType;
	}

	@Override
	public From<S, E, C> from(S stateId) {
		source = StateHelper.getState(stateMap, stateId);
		return this;
	}

	@Override
	public To<S, E, C> to(S stateId) {
		target = StateHelper.getState(stateMap, stateId);
		return this;
	}

	@Override
	public To<S, E, C> within(S stateId) {
		source = target = StateHelper.getState(stateMap, stateId);
		return this;
	}

	@Override
	public When<S, E, C> when(Condition<C> condition) {
		transition.setCondition(condition);
		return this;
	}

	@Override
	public On<S, E, C> on(E event) {
		transition = source.addTransition(event, target, transitionType);
		return this;
	}

	@Override
	public void perform(Action<S, E, C> action) {
		transition.setAction(action);
	}


}
