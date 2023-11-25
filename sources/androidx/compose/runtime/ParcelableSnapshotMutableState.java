package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j0.v2;
import j0.x2;
import j0.y2;
import qc.h;
import qc.q;

/* compiled from: ParcelableSnapshotMutableState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends v2<T> implements Parcelable {

    /* renamed from: p  reason: collision with root package name */
    public static final b f2310p = new b(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            x2 j10;
            q.i(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        j10 = y2.l();
                    } else {
                        throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
                    }
                } else {
                    j10 = y2.o();
                }
            } else {
                j10 = y2.j();
            }
            return new ParcelableSnapshotMutableState<>(readValue, j10);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t10, x2<T> x2Var) {
        super(t10, x2Var);
        q.i(x2Var, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        q.i(parcel, "parcel");
        parcel.writeValue(getValue());
        x2<T> c10 = c();
        if (q.d(c10, y2.j())) {
            i11 = 0;
        } else if (q.d(c10, y2.o())) {
            i11 = 1;
        } else if (q.d(c10, y2.l())) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }
}
