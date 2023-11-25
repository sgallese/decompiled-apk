package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class DataBufferRef {
    @KeepForSdk
    protected final DataHolder mDataHolder;
    @KeepForSdk
    protected int mDataRow;
    private int zaa;

    @KeepForSdk
    public DataBufferRef(DataHolder dataHolder, int i10) {
        this.mDataHolder = (DataHolder) Preconditions.checkNotNull(dataHolder);
        zaa(i10);
    }

    @KeepForSdk
    protected void copyToBuffer(String str, CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zac(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    @KeepForSdk
    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.equal(Integer.valueOf(dataBufferRef.mDataRow), Integer.valueOf(this.mDataRow)) && Objects.equal(Integer.valueOf(dataBufferRef.zaa), Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    protected boolean getBoolean(String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public byte[] getByteArray(String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected int getDataRow() {
        return this.mDataRow;
    }

    @KeepForSdk
    protected double getDouble(String str) {
        return this.mDataHolder.zaa(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected float getFloat(String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public int getInteger(String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    protected long getLong(String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public String getString(String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.mDataHolder.hasColumn(str);
    }

    @KeepForSdk
    protected boolean hasNull(String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder);
    }

    @KeepForSdk
    public boolean isDataValid() {
        if (!this.mDataHolder.isClosed()) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    protected Uri parseUri(String str) {
        String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zaa(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.mDataHolder.getCount()) {
            z10 = true;
        }
        Preconditions.checkState(z10);
        this.mDataRow = i10;
        this.zaa = this.mDataHolder.getWindowIndex(i10);
    }
}
