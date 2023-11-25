package i5;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import qc.h;
import qc.q;

/* compiled from: TrackingOptions.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17009b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f17010c = e.class.getName();

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f17011d = {"city", "country", "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f17012e = {"adid", "city", "ip_address", "lat_lng"};

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f17013a = new HashSet();

    /* compiled from: TrackingOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final e a() {
            e eVar = new e();
            String[] strArr = e.f17012e;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                eVar.c(str);
            }
            return eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        this.f17013a.add(str);
    }

    private final boolean l(String str) {
        return !this.f17013a.contains(str);
    }

    public final e d(e eVar) {
        q.i(eVar, TaskSetupFragment.TYPE_OTHER);
        Iterator<String> it = eVar.f17013a.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        return this;
    }

    public final boolean e() {
        return l("adid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q.d(e.class, obj.getClass())) {
            return false;
        }
        return q.d(((e) obj).f17013a, this.f17013a);
    }

    public final boolean f() {
        return l("app_set_id");
    }

    public final boolean g() {
        return l("carrier");
    }

    public final boolean h() {
        return l("country");
    }

    public final boolean i() {
        return l("device_brand");
    }

    public final boolean j() {
        return l("device_manufacturer");
    }

    public final boolean k() {
        return l("device_model");
    }

    public final boolean m() {
        return l("ip_address");
    }

    public final boolean n() {
        return l("language");
    }

    public final boolean o() {
        return l("lat_lng");
    }

    public final boolean p() {
        return l("os_name");
    }

    public final boolean q() {
        return l("os_version");
    }

    public final boolean r() {
        return l("platform");
    }

    public final boolean s() {
        return l("version_name");
    }
}
