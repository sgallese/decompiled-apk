package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    final List<String> f4540f;

    /* renamed from: m  reason: collision with root package name */
    final List<BackStackRecordState> f4541m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f4540f = list;
        this.f4541m = list2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<androidx.fragment.app.a> a(FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f4540f.size());
        for (String str : this.f4540f) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                Bundle B = fragmentManager.x0().B(str, null);
                if (B != null) {
                    ClassLoader classLoader = fragmentManager.z0().f().getClassLoader();
                    Fragment a10 = ((FragmentState) B.getParcelable("state")).a(fragmentManager.w0(), classLoader);
                    a10.mSavedFragmentState = B;
                    if (B.getBundle("savedInstanceState") == null) {
                        a10.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = B.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a10.setArguments(bundle);
                    hashMap.put(a10.mWho, a10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.f4541m.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4540f);
        parcel.writeTypedList(this.f4541m);
    }

    BackStackState(Parcel parcel) {
        this.f4540f = parcel.createStringArrayList();
        this.f4541m = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
