package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReviewFiberAndTelephone implements Task {

    private int plan;

    public ReviewFiberAndTelephone(int plan) {
        this.plan = plan;
    }

    public static ReviewFiberAndTelephone onMovistar(int plan) {
        return Instrumented.instanceOf(ReviewFiberAndTelephone.class).withProperties(plan);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (plan) {
            case 0:
                OnStage.theActorInTheSpotlight().attemptsTo(ReviewsDuoPlan.onThePage(plan));
                break;

            case 1:
                OnStage.theActorInTheSpotlight().attemptsTo(ReviewsDuoPlan.onThePage(plan));
                break;

            case 2:
                OnStage.theActorInTheSpotlight().attemptsTo(ReviewsDuoPlan.onThePage(plan));
                break;

            case 3:
                OnStage.theActorInTheSpotlight().attemptsTo(ReviewsDuoPlan.onThePage(plan));
                break;

            default:
                System.out.println("No such plan found");
                break;
        }

    }
}
