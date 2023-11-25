package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.p;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.s;
import qc.r;
import yc.v;

/* compiled from: ActivityNavigator.kt */
@p.b("activity")
/* loaded from: classes.dex */
public class a extends p<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final C0109a f5127e = new C0109a(null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f5128c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f5129d;

    /* compiled from: ActivityNavigator.kt */
    /* renamed from: androidx.navigation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0109a {
        private C0109a() {
        }

        public /* synthetic */ C0109a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    public static class b extends i {

        /* renamed from: y  reason: collision with root package name */
        private Intent f5130y;

        /* renamed from: z  reason: collision with root package name */
        private String f5131z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p<? extends b> pVar) {
            super(pVar);
            qc.q.i(pVar, "activityNavigator");
        }

        private final String M(Context context, String str) {
            String B;
            if (str != null) {
                String packageName = context.getPackageName();
                qc.q.h(packageName, "context.packageName");
                B = v.B(str, "${applicationId}", packageName, false, 4, null);
                return B;
            }
            return null;
        }

        @Override // androidx.navigation.i
        public boolean G() {
            return false;
        }

        public final String H() {
            Intent intent = this.f5130y;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName I() {
            Intent intent = this.f5130y;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String J() {
            return this.f5131z;
        }

        public final Intent K() {
            return this.f5130y;
        }

        public final b N(String str) {
            if (this.f5130y == null) {
                this.f5130y = new Intent();
            }
            Intent intent = this.f5130y;
            qc.q.f(intent);
            intent.setAction(str);
            return this;
        }

        public final b O(ComponentName componentName) {
            if (this.f5130y == null) {
                this.f5130y = new Intent();
            }
            Intent intent = this.f5130y;
            qc.q.f(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final b P(Uri uri) {
            if (this.f5130y == null) {
                this.f5130y = new Intent();
            }
            Intent intent = this.f5130y;
            qc.q.f(intent);
            intent.setData(uri);
            return this;
        }

        public final b Q(String str) {
            this.f5131z = str;
            return this;
        }

        public final b R(String str) {
            if (this.f5130y == null) {
                this.f5130y = new Intent();
            }
            Intent intent = this.f5130y;
            qc.q.f(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.i
        public boolean equals(Object obj) {
            boolean z10;
            if (obj == null || !(obj instanceof b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f5130y;
            if (intent != null) {
                z10 = intent.filterEquals(((b) obj).f5130y);
            } else if (((b) obj).f5130y == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || !qc.q.d(this.f5131z, ((b) obj).f5131z)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.i
        public int hashCode() {
            int i10;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f5130y;
            int i11 = 0;
            if (intent != null) {
                i10 = intent.filterHashCode();
            } else {
                i10 = 0;
            }
            int i12 = (hashCode + i10) * 31;
            String str = this.f5131z;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i12 + i11;
        }

        @Override // androidx.navigation.i
        public String toString() {
            ComponentName I = I();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (I != null) {
                sb2.append(" class=");
                sb2.append(I.getClassName());
            } else {
                String H = H();
                if (H != null) {
                    sb2.append(" action=");
                    sb2.append(H);
                }
            }
            String sb3 = sb2.toString();
            qc.q.h(sb3, "sb.toString()");
            return sb3;
        }

        @Override // androidx.navigation.i
        public void y(Context context, AttributeSet attributeSet) {
            qc.q.i(context, "context");
            qc.q.i(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s.f19326a);
            qc.q.h(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            R(M(context, obtainAttributes.getString(s.f19331f)));
            String string = obtainAttributes.getString(s.f19327b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                O(new ComponentName(context, string));
            }
            N(obtainAttributes.getString(s.f19328c));
            String M = M(context, obtainAttributes.getString(s.f19329d));
            if (M != null) {
                P(Uri.parse(M));
            }
            Q(M(context, obtainAttributes.getString(s.f19330e)));
            obtainAttributes.recycle();
        }
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    public static final class c implements p.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5132a;

        public final androidx.core.app.d a() {
            return null;
        }

        public final int b() {
            return this.f5132a;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    static final class d extends r implements pc.l<Context, Context> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f5133f = new d();

        d() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context context) {
            qc.q.i(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        xc.g f10;
        Object obj;
        qc.q.i(context, "context");
        this.f5128c = context;
        f10 = xc.m.f(context, d.f5133f);
        Iterator it = f10.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f5129d = (Activity) obj;
    }

    @Override // androidx.navigation.p
    public boolean k() {
        Activity activity = this.f5129d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.p
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // androidx.navigation.p
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public i d(b bVar, Bundle bundle, m mVar, p.a aVar) {
        int d10;
        int d11;
        Intent intent;
        int intExtra;
        boolean z10;
        qc.q.i(bVar, "destination");
        if (bVar.K() != null) {
            Intent intent2 = new Intent(bVar.K());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String J = bVar.J();
                if (J != null && J.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(J);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + J);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z11 = aVar instanceof c;
            if (z11) {
                intent2.addFlags(((c) aVar).b());
            }
            if (this.f5129d == null) {
                intent2.addFlags(268435456);
            }
            if (mVar != null && mVar.g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f5129d;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.n());
            Resources resources = this.f5128c.getResources();
            if (mVar != null) {
                int c10 = mVar.c();
                int d12 = mVar.d();
                if ((c10 > 0 && qc.q.d(resources.getResourceTypeName(c10), "animator")) || (d12 > 0 && qc.q.d(resources.getResourceTypeName(d12), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c10) + " and popExit resource " + resources.getResourceName(d12) + " when launching " + bVar);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d12);
                }
            }
            if (z11) {
                ((c) aVar).a();
                this.f5128c.startActivity(intent2);
            } else {
                this.f5128c.startActivity(intent2);
            }
            if (mVar != null && this.f5129d != null) {
                int a10 = mVar.a();
                int b10 = mVar.b();
                if ((a10 > 0 && qc.q.d(resources.getResourceTypeName(a10), "animator")) || (b10 > 0 && qc.q.d(resources.getResourceTypeName(b10), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a10) + " and exit resource " + resources.getResourceName(b10) + "when launching " + bVar);
                    return null;
                } else if (a10 >= 0 || b10 >= 0) {
                    d10 = vc.l.d(a10, 0);
                    d11 = vc.l.d(b10, 0);
                    this.f5129d.overridePendingTransition(d10, d11);
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + bVar.n() + " does not have an Intent set.").toString());
    }
}
