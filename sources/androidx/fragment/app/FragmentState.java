package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    final boolean A;

    /* renamed from: f  reason: collision with root package name */
    final String f4645f;

    /* renamed from: m  reason: collision with root package name */
    final String f4646m;

    /* renamed from: p  reason: collision with root package name */
    final boolean f4647p;

    /* renamed from: q  reason: collision with root package name */
    final int f4648q;

    /* renamed from: r  reason: collision with root package name */
    final int f4649r;

    /* renamed from: s  reason: collision with root package name */
    final String f4650s;

    /* renamed from: t  reason: collision with root package name */
    final boolean f4651t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f4652u;

    /* renamed from: v  reason: collision with root package name */
    final boolean f4653v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f4654w;

    /* renamed from: x  reason: collision with root package name */
    final int f4655x;

    /* renamed from: y  reason: collision with root package name */
    final String f4656y;

    /* renamed from: z  reason: collision with root package name */
    final int f4657z;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f4645f = fragment.getClass().getName();
        this.f4646m = fragment.mWho;
        this.f4647p = fragment.mFromLayout;
        this.f4648q = fragment.mFragmentId;
        this.f4649r = fragment.mContainerId;
        this.f4650s = fragment.mTag;
        this.f4651t = fragment.mRetainInstance;
        this.f4652u = fragment.mRemoving;
        this.f4653v = fragment.mDetached;
        this.f4654w = fragment.mHidden;
        this.f4655x = fragment.mMaxState.ordinal();
        this.f4656y = fragment.mTargetWho;
        this.f4657z = fragment.mTargetRequestCode;
        this.A = fragment.mUserVisibleHint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(u uVar, ClassLoader classLoader) {
        Fragment a10 = uVar.a(classLoader, this.f4645f);
        a10.mWho = this.f4646m;
        a10.mFromLayout = this.f4647p;
        a10.mRestored = true;
        a10.mFragmentId = this.f4648q;
        a10.mContainerId = this.f4649r;
        a10.mTag = this.f4650s;
        a10.mRetainInstance = this.f4651t;
        a10.mRemoving = this.f4652u;
        a10.mDetached = this.f4653v;
        a10.mHidden = this.f4654w;
        a10.mMaxState = p.b.values()[this.f4655x];
        a10.mTargetWho = this.f4656y;
        a10.mTargetRequestCode = this.f4657z;
        a10.mUserVisibleHint = this.A;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f4645f);
        sb2.append(" (");
        sb2.append(this.f4646m);
        sb2.append(")}:");
        if (this.f4647p) {
            sb2.append(" fromLayout");
        }
        if (this.f4649r != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f4649r));
        }
        String str = this.f4650s;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f4650s);
        }
        if (this.f4651t) {
            sb2.append(" retainInstance");
        }
        if (this.f4652u) {
            sb2.append(" removing");
        }
        if (this.f4653v) {
            sb2.append(" detached");
        }
        if (this.f4654w) {
            sb2.append(" hidden");
        }
        if (this.f4656y != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f4656y);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f4657z);
        }
        if (this.A) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4645f);
        parcel.writeString(this.f4646m);
        parcel.writeInt(this.f4647p ? 1 : 0);
        parcel.writeInt(this.f4648q);
        parcel.writeInt(this.f4649r);
        parcel.writeString(this.f4650s);
        parcel.writeInt(this.f4651t ? 1 : 0);
        parcel.writeInt(this.f4652u ? 1 : 0);
        parcel.writeInt(this.f4653v ? 1 : 0);
        parcel.writeInt(this.f4654w ? 1 : 0);
        parcel.writeInt(this.f4655x);
        parcel.writeString(this.f4656y);
        parcel.writeInt(this.f4657z);
        parcel.writeInt(this.A ? 1 : 0);
    }

    FragmentState(Parcel parcel) {
        this.f4645f = parcel.readString();
        this.f4646m = parcel.readString();
        this.f4647p = parcel.readInt() != 0;
        this.f4648q = parcel.readInt();
        this.f4649r = parcel.readInt();
        this.f4650s = parcel.readString();
        this.f4651t = parcel.readInt() != 0;
        this.f4652u = parcel.readInt() != 0;
        this.f4653v = parcel.readInt() != 0;
        this.f4654w = parcel.readInt() != 0;
        this.f4655x = parcel.readInt();
        this.f4656y = parcel.readString();
        this.f4657z = parcel.readInt();
        this.A = parcel.readInt() != 0;
    }
}
