package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class serviceTimelines implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "statusUpdate")
	private java.lang.String statusUpdate;
	@org.kie.api.definition.type.Label(value = "timeline")
	private java.lang.String timeline;

	public serviceTimelines() {
	}

	public java.lang.String getStatusUpdate() {
		return this.statusUpdate;
	}

	public void setStatusUpdate(java.lang.String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}

	public java.lang.String getTimeline() {
		return this.timeline;
	}

	public void setTimeline(java.lang.String timeline) {
		this.timeline = timeline;
	}

	public serviceTimelines(java.lang.String statusUpdate,
			java.lang.String timeline) {
		this.statusUpdate = statusUpdate;
		this.timeline = timeline;
	}

}