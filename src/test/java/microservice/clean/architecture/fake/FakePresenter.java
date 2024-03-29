package microservice.clean.architecture.fake;

import microservice.clean.architecture.service.boundary.output.OutputBoundary;
import microservice.clean.architecture.service.boundary.response.TaskResponse;
import microservice.clean.architecture.service.gateway.GatewayResponse;

public class FakePresenter implements OutputBoundary {
	GatewayResponse response;
	
	@Override
	public TaskResponse present() {
		TaskResponse presenter = new FakeTaskResponse();		
		return presenter;
	}

	@Override
	public void setResponse(GatewayResponse response) {
		this.response = response;
	}
	
}
