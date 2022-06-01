package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReviewFiberTvApps implements Task {

    private int plan;

    public ReviewFiberTvApps(int plan) {
        this.plan = plan;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (plan) {
            case 0:
                OnStage.theActorInTheSpotlight().attemptsTo(ReviewsFirstPlan.onThePage(plan));
                break;

            case 1:
                OnStage.theActorInTheSpotlight().attemptsTo(UserReviewsSecondPlan.onThePage(plan));
                break;

            case 2:
                OnStage.theActorInTheSpotlight().attemptsTo(UserReviewsThirdPlan.onThePage(plan));
                break;

            case 3:
                OnStage.theActorInTheSpotlight().attemptsTo(UserReviewsFourthPlan.onThePage(plan));
                break;

            case 4:
                OnStage.theActorInTheSpotlight().attemptsTo(UserReviewsFifthPlan.onThePage(plan));
                break;

        }
    }

    public static ReviewFiberTvApps onMovistar(int plan){
        return Instrumented.instanceOf(ReviewFiberTvApps.class).withProperties(plan);
    }
}
