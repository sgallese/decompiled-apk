package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;

/* compiled from: NavBackStackEntryState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    private final String f5123f;

    /* renamed from: m  reason: collision with root package name */
    private final int f5124m;

    /* renamed from: p  reason: collision with root package name */
    private final Bundle f5125p;

    /* renamed from: q  reason: collision with root package name */
    private final Bundle f5126q;

    /* renamed from: r  reason: collision with root package name */
    public static final b f5122r = new b(null);
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* compiled from: NavBackStackEntryState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            qc.q.i(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i10) {
            return new NavBackStackEntryState[i10];
        }
    }

    /* compiled from: NavBackStackEntryState.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    public NavBackStackEntryState(c cVar) {
        qc.q.i(cVar, "entry");
        this.f5123f = cVar.f();
        this.f5124m = cVar.e().n();
        this.f5125p = cVar.c();
        Bundle bundle = new Bundle();
        this.f5126q = bundle;
        cVar.i(bundle);
    }

    public final int a() {
        return this.f5124m;
    }

    public final String b() {
        return this.f5123f;
    }

    public final c c(Context context, i iVar, p.b bVar, e eVar) {
        qc.q.i(context, "context");
        qc.q.i(iVar, "destination");
        qc.q.i(bVar, "hostLifecycleState");
        Bundle bundle = this.f5125p;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return c.B.a(context, iVar, bundle, bVar, eVar, this.f5123f, this.f5126q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        qc.q.i(parcel, "parcel");
        parcel.writeString(this.f5123f);
        parcel.writeInt(this.f5124m);
        parcel.writeBundle(this.f5125p);
        parcel.writeBundle(this.f5126q);
    }

    public NavBackStackEntryState(Parcel parcel) {
        qc.q.i(parcel, "inParcel");
        String readString = parcel.readString();
        qc.q.f(readString);
        this.f5123f = readString;
        this.f5124m = parcel.readInt();
        this.f5125p = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        qc.q.f(readBundle);
        this.f5126q = readBundle;
    }
}
