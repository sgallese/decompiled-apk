package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f4637f;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<String> f4638m;

    /* renamed from: p  reason: collision with root package name */
    BackStackRecordState[] f4639p;

    /* renamed from: q  reason: collision with root package name */
    int f4640q;

    /* renamed from: r  reason: collision with root package name */
    String f4641r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<String> f4642s;

    /* renamed from: t  reason: collision with root package name */
    ArrayList<BackStackState> f4643t;

    /* renamed from: u  reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f4644u;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f4641r = null;
        this.f4642s = new ArrayList<>();
        this.f4643t = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4637f);
        parcel.writeStringList(this.f4638m);
        parcel.writeTypedArray(this.f4639p, i10);
        parcel.writeInt(this.f4640q);
        parcel.writeString(this.f4641r);
        parcel.writeStringList(this.f4642s);
        parcel.writeTypedList(this.f4643t);
        parcel.writeTypedList(this.f4644u);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f4641r = null;
        this.f4642s = new ArrayList<>();
        this.f4643t = new ArrayList<>();
        this.f4637f = parcel.createStringArrayList();
        this.f4638m = parcel.createStringArrayList();
        this.f4639p = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f4640q = parcel.readInt();
        this.f4641r = parcel.readString();
        this.f4642s = parcel.createStringArrayList();
        this.f4643t = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f4644u = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
