package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f3772a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f3773b;

    /* renamed from: c  reason: collision with root package name */
    String f3774c;

    /* renamed from: d  reason: collision with root package name */
    String f3775d;

    /* renamed from: e  reason: collision with root package name */
    boolean f3776e;

    /* renamed from: f  reason: collision with root package name */
    boolean f3777f;

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    static class a {
        static u a(Person person) {
            IconCompat iconCompat;
            b f10 = new b().f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.a(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f10.c(iconCompat).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(u uVar) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(uVar.c());
            if (uVar.a() != null) {
                icon = uVar.a().s();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(uVar.d()).setKey(uVar.b()).setBot(uVar.e()).setImportant(uVar.f()).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f3778a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f3779b;

        /* renamed from: c  reason: collision with root package name */
        String f3780c;

        /* renamed from: d  reason: collision with root package name */
        String f3781d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3782e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3783f;

        public u a() {
            return new u(this);
        }

        public b b(boolean z10) {
            this.f3782e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f3779b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f3783f = z10;
            return this;
        }

        public b e(String str) {
            this.f3781d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f3778a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f3780c = str;
            return this;
        }
    }

    u(b bVar) {
        this.f3772a = bVar.f3778a;
        this.f3773b = bVar.f3779b;
        this.f3774c = bVar.f3780c;
        this.f3775d = bVar.f3781d;
        this.f3776e = bVar.f3782e;
        this.f3777f = bVar.f3783f;
    }

    public IconCompat a() {
        return this.f3773b;
    }

    public String b() {
        return this.f3775d;
    }

    public CharSequence c() {
        return this.f3772a;
    }

    public String d() {
        return this.f3774c;
    }

    public boolean e() {
        return this.f3776e;
    }

    public boolean f() {
        return this.f3777f;
    }

    public String g() {
        String str = this.f3774c;
        if (str != null) {
            return str;
        }
        if (this.f3772a != null) {
            return "name:" + ((Object) this.f3772a);
        }
        return "";
    }

    public Person h() {
        return a.b(this);
    }

    public Bundle i() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f3772a);
        IconCompat iconCompat = this.f3773b;
        if (iconCompat != null) {
            bundle = iconCompat.r();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f3774c);
        bundle2.putString("key", this.f3775d);
        bundle2.putBoolean("isBot", this.f3776e);
        bundle2.putBoolean("isImportant", this.f3777f);
        return bundle2;
    }
}
