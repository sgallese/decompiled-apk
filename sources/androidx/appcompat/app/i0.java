package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class i0 {

    /* renamed from: d  reason: collision with root package name */
    private static i0 f891d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f892a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f893b;

    /* renamed from: c  reason: collision with root package name */
    private final a f894c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f895a;

        /* renamed from: b  reason: collision with root package name */
        long f896b;

        a() {
        }
    }

    i0(Context context, LocationManager locationManager) {
        this.f892a = context;
        this.f893b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a(Context context) {
        if (f891d == null) {
            Context applicationContext = context.getApplicationContext();
            f891d = new i0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f891d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location;
        Location location2 = null;
        if (androidx.core.content.e.b(this.f892a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (androidx.core.content.e.b(this.f892a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    private Location c(String str) {
        try {
            if (this.f893b.isProviderEnabled(str)) {
                return this.f893b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        if (this.f894c.f896b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    private void f(Location location) {
        boolean z10;
        long j10;
        long j11;
        a aVar = this.f894c;
        long currentTimeMillis = System.currentTimeMillis();
        h0 b10 = h0.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (b10.f890c == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = b10.f889b;
        long j13 = b10.f888a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j14 = b10.f889b;
        if (j12 != -1 && j13 != -1) {
            if (currentTimeMillis > j13) {
                j11 = j14 + 0;
            } else if (currentTimeMillis > j12) {
                j11 = j13 + 0;
            } else {
                j11 = j12 + 0;
            }
            j10 = j11 + 60000;
        } else {
            j10 = 43200000 + currentTimeMillis;
        }
        aVar.f895a = z10;
        aVar.f896b = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f894c;
        if (e()) {
            return aVar.f895a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f895a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        if (i10 >= 6 && i10 < 22) {
            return false;
        }
        return true;
    }
}
