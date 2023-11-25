package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j0.s2;
import qc.h;
import qc.q;

/* compiled from: ParcelableSnapshotMutableFloatState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableFloatState extends s2 implements Parcelable {

    /* renamed from: m  reason: collision with root package name */
    public static final b f2307m = new b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableFloatState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableFloatState[] newArray(int i10) {
            return new ParcelableSnapshotMutableFloatState[i10];
        }
    }

    /* compiled from: ParcelableSnapshotMutableFloatState.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    public ParcelableSnapshotMutableFloatState(float f10) {
        super(f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "parcel");
        parcel.writeFloat(b());
    }
}
