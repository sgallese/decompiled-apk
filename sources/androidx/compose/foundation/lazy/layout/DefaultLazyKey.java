package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import qc.h;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Lazy.android.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class DefaultLazyKey implements Parcelable {

    /* renamed from: f  reason: collision with root package name */
    private final int f2151f;

    /* renamed from: m  reason: collision with root package name */
    public static final b f2150m = new b(null);
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    /* compiled from: Lazy.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey[] newArray(int i10) {
            return new DefaultLazyKey[i10];
        }
    }

    /* compiled from: Lazy.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    public DefaultLazyKey(int i10) {
        this.f2151f = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DefaultLazyKey) && this.f2151f == ((DefaultLazyKey) obj).f2151f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2151f;
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f2151f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "parcel");
        parcel.writeInt(this.f2151f);
    }
}
