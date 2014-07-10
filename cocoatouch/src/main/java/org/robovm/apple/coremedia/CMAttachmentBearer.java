/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coremedia;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMAttachmentBearer/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMAttachmentBearerPtr extends Ptr<CMAttachmentBearer, CMAttachmentBearerPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMAttachmentBearer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CMAttachmentBearer() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMSetAttachment", optional=true)
    public native void add(CFString key, CFType value, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMGetAttachment", optional=true)
    public native CFType get(CFString key, IntPtr attachmentModeOut);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMRemoveAttachment", optional=true)
    public native void remove(CFString key);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMRemoveAllAttachments", optional=true)
    public native void removeAll();
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMCopyDictionaryOfAttachments", optional=true)
    public static native CFDictionary copyDictionaryOfAttachments(CFAllocator allocator, CMAttachmentBearer target, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMSetAttachments", optional=true)
    public native void setAttachments(CFDictionary theAttachments, CMAttachmentMode attachmentMode);
    /**
     * @since Available in iOS 4.0  and later.
     */
    @Bridge(symbol="CMPropagateAttachments", optional=true)
    public native void propagateAttachments(CMAttachmentBearer destination);
    /*</methods>*/
}
