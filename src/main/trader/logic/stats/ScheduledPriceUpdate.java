package logic.stats;

import com.binance.api.client.domain.event.AggTradeEvent;
import logic.MarketDataManager;
import logic.EventManager;
import logic.listeners.ScheduledTradeEventListener;

public class ScheduledPriceUpdate implements ScheduledTradeEventListener {
    public double getPrice() {
        return price;
    }

    private double price;
    @Override
    public void handleScheduledTradeEvent(AggTradeEvent aggTradeEvent) {
        this.price = Double.parseDouble(aggTradeEvent.getPrice());
        System.out.println(this.price);
    }

//    public static void main(String[] args) {
//        EventManager eventManager = new EventManager(new MarketDataManager());
//        ScheduledPriceUpdate priceGenerator = new ScheduledPriceUpdate();
//        eventManager.getScheduleManager().periodicCallback(100, priceGenerator);
//        while(true) {
//            double price = priceGenerator.getPrice();
//            System.out.println(price);
//        }
//    }

}
