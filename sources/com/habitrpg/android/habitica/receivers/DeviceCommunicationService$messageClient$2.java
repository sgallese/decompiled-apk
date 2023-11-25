package com.habitrpg.android.habitica.receivers;

import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.Wearable;
import pc.a;
import qc.r;

/* compiled from: DeviceCommunicationService.kt */
/* loaded from: classes4.dex */
final class DeviceCommunicationService$messageClient$2 extends r implements a<MessageClient> {
    final /* synthetic */ DeviceCommunicationService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCommunicationService$messageClient$2(DeviceCommunicationService deviceCommunicationService) {
        super(0);
        this.this$0 = deviceCommunicationService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final MessageClient invoke() {
        return Wearable.getMessageClient(this.this$0);
    }
}
