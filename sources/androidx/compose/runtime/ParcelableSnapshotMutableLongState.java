package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j0.u2;
import qc.h;
import qc.q;

/* compiled from: ParcelableSnapshotMutableLongState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableLongState extends u2 implements Parcelable {

    /* renamed from: m  reason: collision with root package name */
    public static final b f2309m = new b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableLongState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState[] newArray(int i10) {
            return new ParcelableSnapshotMutableLongState[i10];
        }
    }

    /* compiled from: ParcelableSnapshotMutableLongState.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    public ParcelableSnapshotMutableLongState(long j10) {
        super(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "parcel");
        parcel.writeLong(a());
    }
}
