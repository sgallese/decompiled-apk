package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.g;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes3.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: p  reason: collision with root package name */
    public final g<String, Bundle> f10367p;

    /* loaded from: classes3.dex */
    class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.material.stateful.ExtendableSavedState$a, java.lang.ClassLoader] */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            ?? r12 = 0;
            return new ExtendableSavedState(parcel, r12, r12);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState[] newArray(int i10) {
            return new ExtendableSavedState[i10];
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f10367p + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f10367p.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f10367p.j(i11);
            bundleArr[i11] = this.f10367p.n(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f10367p = new g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f10367p = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f10367p.put(strArr[i10], bundleArr[i10]);
        }
    }
}
