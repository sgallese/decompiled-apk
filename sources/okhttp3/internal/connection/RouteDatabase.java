package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
import qc.q;

/* compiled from: RouteDatabase.kt */
/* loaded from: classes4.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        q.i(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        q.i(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        q.i(route, "route");
        return this.failedRoutes.contains(route);
    }
}
