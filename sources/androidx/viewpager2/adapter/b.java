package androidx.viewpager2.adapter;

import android.os.Parcelable;

/* compiled from: StatefulAdapter.java */
/* loaded from: classes.dex */
public interface b {
    void restoreState(Parcelable parcelable);

    Parcelable saveState();
}
