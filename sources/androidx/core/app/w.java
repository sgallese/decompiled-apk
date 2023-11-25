package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final String f3786a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f3787b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f3788c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3789d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3790e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f3791f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f3792g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(w wVar) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(wVar.i()).setLabel(wVar.h()).setChoices(wVar.e()).setAllowFreeFormInput(wVar.c()).addExtras(wVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = wVar.d()) != null) {
                Iterator<String> it = d10.iterator();
                while (it.hasNext()) {
                    b.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, wVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static class b {
        static void a(w wVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(w.a(wVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* compiled from: RemoteInput.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f3793a;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f3796d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f3797e;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f3794b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f3795c = new Bundle();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3798f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f3799g = 0;

        public d(String str) {
            if (str != null) {
                this.f3793a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public w a() {
            return new w(this.f3793a, this.f3796d, this.f3797e, this.f3798f, this.f3799g, this.f3795c, this.f3794b);
        }

        public d b(CharSequence charSequence) {
            this.f3796d = charSequence;
            return this;
        }
    }

    w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f3786a = str;
        this.f3787b = charSequence;
        this.f3788c = charSequenceArr;
        this.f3789d = z10;
        this.f3790e = i10;
        this.f3791f = bundle;
        this.f3792g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(w wVar) {
        return a.b(wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = a(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f3789d;
    }

    public Set<String> d() {
        return this.f3792g;
    }

    public CharSequence[] e() {
        return this.f3788c;
    }

    public int f() {
        return this.f3790e;
    }

    public Bundle g() {
        return this.f3791f;
    }

    public CharSequence h() {
        return this.f3787b;
    }

    public String i() {
        return this.f3786a;
    }

    public boolean k() {
        if (!c() && ((e() == null || e().length == 0) && d() != null && !d().isEmpty())) {
            return true;
        }
        return false;
    }
}
