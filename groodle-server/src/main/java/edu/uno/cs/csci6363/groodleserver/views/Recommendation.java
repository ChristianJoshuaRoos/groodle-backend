package edu.uno.cs.csci6363.groodleserver.views;

import edu.uno.cs.csci6363.groodleserver.views.ConcentrationRecommendation;;

public class Recommendation{
    private ConcentrationRecommendation depthRecommendation;
    private ConcentrationRecommendation[] breadthRecommendations;

    public ConcentrationRecommendation getDepthRecommendation() {
        return this.depthRecommendation;
    }

    public void setDepthRecommendation(ConcentrationRecommendation depthRecommendation) {
        this.depthRecommendation = depthRecommendation;
    }

    public ConcentrationRecommendation[] getBreadthRecommendations() {
        return this.breadthRecommendations;
    }

    public void setBreadthRecommendations(ConcentrationRecommendation[] breadthRecommendations) {
        this.breadthRecommendations = breadthRecommendations;
    }
   
}