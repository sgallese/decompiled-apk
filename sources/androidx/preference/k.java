package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6322a;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6324c;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences.Editor f6325d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6326e;

    /* renamed from: f  reason: collision with root package name */
    private String f6327f;

    /* renamed from: g  reason: collision with root package name */
    private int f6328g;

    /* renamed from: i  reason: collision with root package name */
    private PreferenceScreen f6330i;

    /* renamed from: j  reason: collision with root package name */
    private c f6331j;

    /* renamed from: k  reason: collision with root package name */
    private a f6332k;

    /* renamed from: l  reason: collision with root package name */
    private b f6333l;

    /* renamed from: b  reason: collision with root package name */
    private long f6323b = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f6329h = 0;

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public static abstract class d {
    }

    public k(Context context) {
        this.f6322a = context;
        v(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void n(Context context, int i10, boolean z10) {
        o(context, d(context), c(), i10, z10);
    }

    public static void o(Context context, String str, int i10, int i11, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        if (z10 || !sharedPreferences.getBoolean("_has_set_default_values", false)) {
            k kVar = new k(context);
            kVar.v(str);
            kVar.u(i10);
            kVar.m(context, i11, null);
            sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
        }
    }

    private void p(boolean z10) {
        SharedPreferences.Editor editor;
        if (!z10 && (editor = this.f6325d) != null) {
            editor.apply();
        }
        this.f6326e = z10;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f6330i;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.f(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SharedPreferences.Editor e() {
        if (this.f6326e) {
            if (this.f6325d == null) {
                this.f6325d = l().edit();
            }
            return this.f6325d;
        }
        return l().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        long j10;
        synchronized (this) {
            j10 = this.f6323b;
            this.f6323b = 1 + j10;
        }
        return j10;
    }

    public b g() {
        return this.f6333l;
    }

    public c h() {
        return this.f6331j;
    }

    public d i() {
        return null;
    }

    public f j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.f6330i;
    }

    public SharedPreferences l() {
        Context b10;
        j();
        if (this.f6324c == null) {
            if (this.f6329h != 1) {
                b10 = this.f6322a;
            } else {
                b10 = androidx.core.content.a.b(this.f6322a);
            }
            this.f6324c = b10.getSharedPreferences(this.f6327f, this.f6328g);
        }
        return this.f6324c;
    }

    public PreferenceScreen m(Context context, int i10, PreferenceScreen preferenceScreen) {
        p(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new j(context, this).d(i10, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        p(false);
        return preferenceScreen2;
    }

    public void q(a aVar) {
        this.f6332k = aVar;
    }

    public void r(b bVar) {
        this.f6333l = bVar;
    }

    public void s(c cVar) {
        this.f6331j = cVar;
    }

    public boolean t(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f6330i;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.onDetached();
            }
            this.f6330i = preferenceScreen;
            return true;
        }
        return false;
    }

    public void u(int i10) {
        this.f6328g = i10;
        this.f6324c = null;
    }

    public void v(String str) {
        this.f6327f = str;
        this.f6324c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return !this.f6326e;
    }

    public void x(Preference preference) {
        a aVar = this.f6332k;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }
}
