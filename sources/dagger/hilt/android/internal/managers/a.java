package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;

/* compiled from: ActivityComponentManager.java */
/* loaded from: classes4.dex */
public class a implements ab.b<Object> {

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f13167f;

    /* renamed from: m  reason: collision with root package name */
    private final Object f13168m = new Object();

    /* renamed from: p  reason: collision with root package name */
    protected final Activity f13169p;

    /* renamed from: q  reason: collision with root package name */
    private final ab.b<ta.b> f13170q;

    /* compiled from: ActivityComponentManager.java */
    /* renamed from: dagger.hilt.android.internal.managers.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0302a {
        wa.a activityComponentBuilder();
    }

    public a(Activity activity) {
        this.f13169p = activity;
        this.f13170q = new b((ComponentActivity) activity);
    }

    protected Object a() {
        String str;
        if (!(this.f13169p.getApplication() instanceof ab.b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(this.f13169p.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + this.f13169p.getApplication().getClass();
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        return ((InterfaceC0302a) ra.a.a(this.f13170q, InterfaceC0302a.class)).activityComponentBuilder().activity(this.f13169p).build();
    }

    @Override // ab.b
    public Object generatedComponent() {
        if (this.f13167f == null) {
            synchronized (this.f13168m) {
                if (this.f13167f == null) {
                    this.f13167f = a();
                }
            }
        }
        return this.f13167f;
    }
}
