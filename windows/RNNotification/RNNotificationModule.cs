using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Notification.RNNotification
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNNotificationModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNNotificationModule"/>.
        /// </summary>
        internal RNNotificationModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNNotification";
            }
        }
    }
}
