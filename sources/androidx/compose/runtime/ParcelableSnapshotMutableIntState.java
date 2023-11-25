package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j0.t2;
import qc.h;
import qc.q;

/* compiled from: ParcelableSnapshotMutableIntState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableIntState extends t2 implements Parcelable {

    /* renamed from: m  reason: collision with root package name */
    public static final b f2308m = new b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableIntState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState[] newArray(int i10) {
            return new ParcelableSnapshotMutableIntState[i10];
        }
    }

    /* compiled from: ParcelableSnapshotMutableIntState.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    public ParcelableSnapshotMutableIntState(int i10) {
        super(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "parcel");
        parcel.writeInt(d());
    }
}
