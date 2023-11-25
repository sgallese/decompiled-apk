package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class y implements Iterable<Intent> {

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Intent> f3801f = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private final Context f3802m;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private y(Context context) {
        this.f3802m = context;
    }

    public static y h(Context context) {
        return new y(context);
    }

    public y a(Intent intent) {
        this.f3801f.add(intent);
        return this;
    }

    public y e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3802m.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        a(intent);
        return this;
    }

    public y f(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = k.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f3802m.getPackageManager());
            }
            g(component);
            a(intent);
        }
        return this;
    }

    public y g(ComponentName componentName) {
        int size = this.f3801f.size();
        try {
            Intent b10 = k.b(this.f3802m, componentName);
            while (b10 != null) {
                this.f3801f.add(size, b10);
                b10 = k.b(this.f3802m, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public Intent i(int i10) {
        return this.f3801f.get(i10);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3801f.iterator();
    }

    public int j() {
        return this.f3801f.size();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (!this.f3801f.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3801f.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.l(this.f3802m, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3802m.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
