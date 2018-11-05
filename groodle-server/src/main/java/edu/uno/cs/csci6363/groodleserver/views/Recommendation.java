package edu.uno.cs.csci6363.groodleserver.views;

import edu.uno.cs.csci6363.groodleserver.views.ConcentrationRecommendation;;

public class Recommendation{
    private ConcentrationRecommendation depthRecommendations;
    private ConcentrationRecommendation[] breadthRecommendations;

    public ConcentrationRecommendation getDepthRecommendations() {
        return this.depthRecommendations;
    }

    public void setDepthRecommendations(ConcentrationRecommendation depthRecommendations) {
        this.depthRecommendations = depthRecommendations;
    }

    public ConcentrationRecommendation[] getBreadthRecommendations() {
        return this.breadthRecommendations;
    }

    public void setBreadthRecommendations(ConcentrationRecommendation[] breadthRecommendations) {
        this.breadthRecommendations = breadthRecommendations;
    }

    
   
}