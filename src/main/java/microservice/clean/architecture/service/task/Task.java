package microservice.clean.architecture.service.task;

import microservice.clean.architecture.exception.ModuleMissingConcreteClassException;
import microservice.clean.architecture.service.boundary.output.OutputBoundary;
import microservice.clean.architecture.service.module.Module;

public interface Task {
	public OutputBoundary execute(Module module) throws InstantiationException, IllegalAccessException, ModuleMissingConcreteClassException;
}
